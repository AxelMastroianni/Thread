package concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class GetSitePageExecutor implements Callable<String> {
	
	private String url;
	
	public GetSitePageExecutor(String url) {
		this.url=url;
	}

	@Override
	public String call() throws Exception {
		try {
		URL u=new URL(url);
		URLConnection connection=u.openConnection();
		InputStream is=connection.getInputStream();
		
		return Utils.getString(is);
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
