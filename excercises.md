Good 👍 — this is exactly the kind of problem where **thinking about class design first** makes the coding much easier. I’ll guide you step-by-step without giving the full solution.

Think in terms of **objects in the real world**.

---

# 1️⃣ Identify the main objects

Ask yourself: *What things exist in this program?*

You have:

* A **Recipe**
* A **collection of recipes**
* The **user interface / program**

So a natural design is something like:

```
Recipe
RecipeBook (or RecipeManager)
Main
```

---

# 2️⃣ The `Recipe` class

A **recipe** clearly has:

* a **name**
* a **cooking time**
* **ingredients**

So ask yourself: *what fields should this class have?*

Example structure (not the full answer):

```
Recipe
----------------
name
cookingTime
ingredients
```

Think about the types:

* name → `String`
* cookingTime → `int`
* ingredients → probably `ArrayList<String>`

So the class might start like:

```java
public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

}
```

Now ask: *What should a recipe be able to do?*

Possible methods:

```
getName()
getCookingTime()
getIngredients()
hasIngredient(String ingredient)
nameContains(String word)
```

These methods will make **searching easier later**.

Example idea:

```
recipe.nameContains("roll")
recipe.hasIngredient("egg")
```

---

# 3️⃣ The `RecipeBook` (or `RecipeManager`) class

This class manages **many recipes**.

Think of it like a **database**.

Fields:

```
ArrayList<Recipe> recipes
```

Now think about what actions the program needs:

From the assignment:

```
list recipes
find by name
find by cooking time
find by ingredient
```

So your methods might look like:

```
addRecipe(Recipe recipe)
listRecipes()
findByName(String word)
findByCookingTime(int maxTime)
findByIngredient(String ingredient)
```

Each method will **loop through the recipes list**.

Example thinking:

```
for each recipe
    if recipe matches condition
        print it
```

---

# 4️⃣ File reading responsibility

Now ask an important design question:

> Which class should read the file?

Two reasonable options:

### Option A (simpler for this course)

`Main` reads the file and **creates Recipe objects**.

```
Main
 ├ read file
 ├ create Recipe
 └ add to RecipeBook
```

### Option B (cleaner OOP)

`RecipeBook` reads the file.

```
recipeBook.readFromFile("recipes.txt")
```

For MOOC exercises, **Option A is usually easier**.

---

# 5️⃣ Understand the file format

Each recipe looks like:

```
name
time
ingredient
ingredient
ingredient

(blank line)
```

So the reading logic is basically:

```
while file has lines
    read name
    read cooking time

    ingredients = []

    while next line not empty
        add ingredient

    create Recipe
```

---

# 6️⃣ Printing recipes

Notice the output format:

```
Pancake dough, cooking time: 60
```

So a very nice design is to override `toString()` in `Recipe`.

Example idea:

```java
public String toString() {
    return this.name + ", cooking time: " + this.cookingTime;
}
```

Then printing becomes very clean:

```
System.out.println(recipe);
```

---

# 7️⃣ How searching should work

### Find by name

Loop recipes and check:

```
recipe.getName().contains(word)
```

---

### Find by cooking time

```
recipe.getCookingTime() <= maxTime
```

---

### Find by ingredient

Here the `Recipe` class helps a lot.

Inside `Recipe` you might have:

```
boolean hasIngredient(String ingredient)
```

Then searching becomes easy:

```
if(recipe.hasIngredient("egg"))
```

---

# 8️⃣ Final class structure (concept)

Think of the program like this:

```
Main
 ├ read file
 ├ create recipes
 ├ store them in RecipeBook
 └ user commands

Recipe
 ├ name
 ├ cookingTime
 ├ ingredients
 ├ containsIngredient()
 └ nameContains()

RecipeBook
 ├ ArrayList<Recipe>
 ├ list()
 ├ findByName()
 ├ findByCookingTime()
 └ findByIngredient()
```

---

# 9️⃣ A small design tip that helps a LOT

Put **search logic inside `Recipe` when possible**.

Example:

Instead of:

```
if(recipe.getIngredients().contains(x))
```

do:

```
recipe.hasIngredient(x)
```

This keeps your code **clean and readable**.

---

✅ If you want, I can also show you:

* **how to parse the recipe file (this part confuses most students)**
* **the 6-step algorithm to read recipes correctly**
* **a class diagram that makes this assignment trivial**.
