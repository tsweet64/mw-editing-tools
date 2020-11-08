# mw-editing-tools
These are some simple scripts that I have made to make editing wikis and processing images a little easier. More will be coming soon.

## Gallery Sorter
This program sorts MediaWiki galleries alphabetically, using the entry's display name as the sort key and attempting to handle special characters properly.

### Compiling
If you don't plan to make any modifications, you can download the pre-compiled JAR file from the releases tab on GitHub and use it. Otherwise, compile them as usual, such as: `javac GalleryEntry.java GallerySorter.java && jar cvfe sorter.jar GallerySorter GalleryEntry.class GallerySorter.class`

### Usage
To sort a gallery, paste the gallery's code into a text editor and save the file in the same folder as the JAR file (or the two `.class` files). Run `java -jar sorter.jar file.txt`, which will output the sorted gallery to standard output. Please double-check it for accuracy and report any bugs.
