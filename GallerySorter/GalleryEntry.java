
public class GalleryEntry implements Comparable<GalleryEntry> {
	private String galListEntry;
	private String sortKey;
	//constructor
	public GalleryEntry(String galListEntry) {
		this.galListEntry = galListEntry;
		this.sortKey = genSortKey(galListEntry);
	}
	//generates the sort key. Grabs the text after the last "|", strips "[","]", and "''" from it, and returns it.
	public String genSortKey(String galItem) {
		String nameField = galItem.substring(galItem.lastIndexOf("|")+1);
		nameField = nameField.replace("[","").replace("]","").replace("''","");
		return nameField;
	}
	//public getter method for the sortkey
	public String getSortKey() {
		return this.sortKey;
	}
	//compares the sort keys of the gallery items; used by the Collections.sort() method.
	public int compareTo(GalleryEntry c) {
		return this.sortKey.compareTo(c.getSortKey());
	}
	//returns the full string of the gallery item, removes "Image:"/"File:", and changes underscore to space. These are additional operations that improve MediaWiki Gallery formatting
	public String toString() {
		return galListEntry.replace("File:","").replace("Image:","").replace("_"," ");
	}
	
}
