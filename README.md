# Half-Price Book Finder

I wrote this small tool for myself in order to better use Half-Price Book's website (which leaves something to be
desired if you're trying to keep track of when books arrive at a store.)

## How To Use

```
$ ./gradlew run
```

...But you probably want to configure some books first.

## How To Configure

You need to configure the run in the `Config.kt` file.

The configuration is very manual because it was just a short fun-time project. Also the HPB website mixes up data
all the time, so you really need someone *looking* at it to make sure it's correct.

The URLs for books can be found this way:

1. Find the landing page for the book (e.g. https://hpb.com/products/nimona-9780062278227)
2. Click on the tab for which edition you want (hardcover, paperback, etc.)
3. Open dev tools to monitor traffic.
4. Expand one of the editions.
5. Capture the URL that loads those books (e.g. https://www.hpb.com/marketplace/5622528/tab/paperback/publisher/harperteen-2015?_=1574969336054).

Be careful - these editions often don't actually match the book above it! Make sure your ISBNs are correct!

(I recommend using https://hpb.com/textbooks/ for looking up books directly by ISBN, too.)
