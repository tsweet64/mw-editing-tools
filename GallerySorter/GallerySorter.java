import java.util.*;
import java.io.*;
public class GallerySorter {

	public static void main(String[] args) throws FileNotFoundException {
		//Sets the input filename based on the first command-line argument
		Scanner reader = new Scanner(new File(args[0]));
		//Creates an ArrayList to store gallery entries
		List<GalleryEntry> gallery = new ArrayList<GalleryEntry>();
		//Creates GalleryEntry object for each line in the text file
		while(reader.hasNextLine())
			gallery.add(new GalleryEntry(reader.nextLine()));
		reader.close();
		//Sorts list
		Collections.sort(gallery);
		//Outputs sorted gallery to stdout
		for (GalleryEntry e:gallery) {
			System.out.println(e);
		}
	}

}
