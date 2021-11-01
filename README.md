# Selectors

Selectors are ways to select a node in the application

In every application, there is a selector we can reference called ".root"

This is pretty much the application window, or "region". So in our css we can
reference it and do some manipulations, like changing it's background color

```css
.root {
	-fx-background-color: blue;
}
```

We can reference nodes using their class names also. So the Rectangle that we
have on the scene can be updated using the "Recangle" selector.

# Classes

If you notice we put a dot before the word "root", this is indicating that we're
using a class selector. We can create a new class by adding it to our nodes
