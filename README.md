# RecyclerView with custom interface listener sample
A proper way to implement onClick listener to RecyclerView.

This gets rid of putting more boilerplate code into onBindViewHolder, which means this sample project only binds the logic of onClick listener inside ViewHolder. And it is and always a better practice to attached listener inside ViewHolder instead of onBindViewHolder(), that is because onBindViewHolder() is called for each and every item and this is unnecessary option to repeat.

Don't
Repeat
Yourself.




