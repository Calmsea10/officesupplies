import java.util.*;

public class Document
{
    private ArrayList<Character> contents;
    private int place;

    public Document()
    {
        contents=new ArrayList<Character>();
        place=0;
    }

    public int getPlace()
    {
        return place;
    }

    public int getSize()
    {
        return contents.size();
    }

    public ArrayList<Character> getContents()
    {
        return contents;
    }

    /**
     * Moves the cursor a number of spaces
     * @param spaces the number of spaces to move. Can be negative for backwards movement
     * @return true if move is possible, false if out-of-bounds
     */
    public boolean move(int spaces)
    {
        if(place+spaces>=contents.size()||place+spaces<0)
        {
            return false;
        }
        place+=spaces;
        return true;
    }

    /**
     * Sets the character at position of cursor to character newchar
     * @param newchar the character to set
     */
    public void set(char newchar)
    {
        contents.set(place,newchar);
    }

    /**
     * Appends a character to the end of the string
     * @param newchar the character to append
     */
    public void append(char newchar)
    {
        contents.add(newchar);
    }

    /**
     * Inserts a character at position of cursor
     * @param newchar the character to insert
     */
    public void add(char newchar)
    {
        contents.add(place,newchar);
    }
}