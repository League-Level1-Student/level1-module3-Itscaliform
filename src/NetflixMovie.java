
public class NetflixMovie {
public static void main(String[] args) {
	Movie Simpsons = new Movie("Simpsons the Movie",1);
	Movie BeeMovie= new Movie("The Bee Movie",4);
	Movie TheRevinant = new Movie ("The Revenant", 5);
	Movie FishTales = new Movie ("FishTales", 3);
	Movie TheMummy = new Movie ("TheMummy", 1);
	

	Simpsons.getTicketPrice();
	
	NetflixQueue robert= new NetflixQueue();
	 robert.addMovie(BeeMovie);
	 robert.addMovie(Simpsons);
	 robert.addMovie(TheRevinant);
	 robert.addMovie(FishTales);
	 robert.addMovie(TheMummy);
	 System.out.println(robert.movies);
	 
	 System.out.println("the best movie is"+robert.getBestMovie());
	 System.out.println("The Second best movie is"+ robert.getMovie(1));
}
}
