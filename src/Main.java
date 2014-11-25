import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;
import java.util.List;


public class Main {
	
	/// ce sont les clés de mon appli twitter
	private String CONSUMER_KEY = "7fXNP4Mp9OAVSGRsXnJJ5fzsS";
	private String CONSUMER_SECRET = "GOFU***********";
	
	// et ici il faut indiquer vos clés d'autorisation, que vous aurez généré par le-moyen-que-vous-savez (et si vous savez pas TANT PIS)
	private String ACCESS_TOKEN = "";
	private String ACCESS_TOKEN_SECRET = "";

	public static void main(String args[])
	{
		new Main();
	}

	Main(){
		try
		{
			ConfigurationBuilder cb = new ConfigurationBuilder();
			cb.setDebugEnabled(true)
			  .setOAuthConsumerKey(CONSUMER_KEY)
			  .setOAuthConsumerSecret(CONSUMER_SECRET)
			  .setOAuthAccessToken(ACCESS_TOKEN)
			  .setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);
			  
			TwitterFactory tf = new TwitterFactory(cb.build());
			Twitter twitter = tf.getInstance();

			//////get the whole tweetline and print it
			//
			//
			/*
			List<Status> statuses = twitter.getHomeTimeline();
			System.out.println("Showing home timeline.");
			for (Status status : statuses) {
				System.out.println(status.getUser().getName() + ":" +
				status.getText());
			}
			*/
			//
			//////
			
			
			//////////// print some user infos 
			//
			//
			User fox = twitter.showUser("whitefox_dev");
			System.out.println("Creation date : " + fox.getCreatedAt());
			System.out.println("Bio : " + fox.getDescription());
			System.out.println("Nb de followers : " + fox.getFollowersCount());
			System.out.println("Nb d'amis : " + fox.getFriendsCount());
			System.out.println("ID : " + fox.getId());
			System.out.println("Langue : " + fox.getLang());
			System.out.println("Location : " + fox.getLocation());
			System.out.println("Nom : " + fox.getName());
			System.out.println("URL d'avatar : " + fox.getProfileImageURL());
			System.out.println("Screen name : " + fox.getScreenName());
			System.out.println("Status : " + fox.getStatus());
			System.out.println("Nb statut : " + fox.getStatusesCount());
			System.out.println("Fuseau horaire : " + fox.getTimeZone());
			System.out.println("URL : " + fox.getURL());
			System.out.println("UTC Offset : " + fox.getUtcOffset());
			System.out.println("GeoEnabled? : " + fox.isGeoEnabled());

			
			//
			/////
			
			
			
			

		} catch (TwitterException ex){
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
}
	
}
