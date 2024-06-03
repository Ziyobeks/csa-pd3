public class Location {
  private int theRow;
  private int theCol;
  
  public Location (int r,int c) {
    theRow = r;
    theCol = c;
  }
  public int getRow() {
    return theRow;
  }
  public int getCol() {
    return theCol;
  }
  public boolean equals(Object other) {
    if(this == other)
      return true;

    if(! (other instanceof Location))    
      return false;
    
    Location otherLoc = (Location) other;
    return theRow == otherLoc.theRow && theCol == otherLoc.theCol;
    }
  public String toString() {
    return "r: " + theRow +", c: " + theCol;
    }
}
