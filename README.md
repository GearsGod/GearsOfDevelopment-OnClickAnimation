# OnClickAnimation

Make a click animation

- Can change animation
- Can update default animation
- Simplify use

# How to Use?

-> Implements class **com.gearsofdevelopment.onanimationclick.OnClickListener** with any click listener

    button.setOnClickListener(object : OnClickListener<Any>() {
            override fun onClick(v: View, t: Any?) {
                Toast.makeText(applicationContext, getString(R.string.clicked), Toast.LENGTH_SHORT)
                    .show()
            }
        })
        
-> where **t** is a button tag


# Example GIF
![](https://github.com/GearsGod/OnClickAnimation/blob/main/app/src/main/assets/example.gif)
