package ch.bochenek.memory;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.users.User;

import java.util.ArrayList;
import java.util.Date;

import javax.inject.Named;

@Api(
    name = "library",
    version = "v1",
    scopes = {Constants.EMAIL_SCOPE},
    clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID, Constants.IOS_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID},
    audiences = {Constants.ANDROID_AUDIENCE}
)
public class LibraryAPI {

  public static ArrayList<Library> libraries = new ArrayList<Library>();

  public Library get(@Named("id") String id) throws NotFoundException {
    try {
      Library lib = new Library(id, "testname");
      lib.addImage(new Image("test1", "http://bochenek.ca/pics/bochenek.jpg", null));
      return lib; //TODOgreetings.get(id);
    } catch (IndexOutOfBoundsException e) {
      throw new NotFoundException("Greeting not found with an index: " + id);
    }
  }

}
