public class Movie {
    private String title;
  private int rating;
  private double duration;


/*** Constructor ****/
public Movie(String t, double d)
{
  title = t;
  duration = 0;
  rating = 0;
}

public void adjustRating(int r)
{
  if((rating+r<11) && (rating+r>-1))
  {
    rating += r;
  }
  else{System.out.println("out of bounds rating");}
}

 /*** Accessor methods ***/
public String getTitle() {
  return title;
}

public double getDuration() {
  return duration;
}

public int getRating() {
  return rating;
}

public String toString() 
{
  String info = "\"" + title + "\", The movie's duration is " + duration;
  if (rating != 0) 
  { 
    info += ", rating is " + rating;
  }
  return info;
}

/*** Mutator methods ***/
public void setTitle(String t) {
  title = t;
}

public void setDuration(Double d) {
  duration = d;

}

public boolean equals(Movie m)
{
if(this.title.equals(m.title) && this.duration == m.duration)
return true;
else{return false;}
}
}




