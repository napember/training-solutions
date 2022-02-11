package stringmethods;

import java.util.Locale;

public class UrlManager {

    private String url;

    private String workUrl;

    private String protocol;
    private int port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        this.url = url.toLowerCase();
        this.workUrl = this.url;

        this.protocol = getWord("://");

        String portStr = getWordBetween("host:","/", 0);

        if ( portStr.isEmpty() ) {
            this.port = 0;
        }
        else {
            this.port= Integer.parseInt(portStr);
            this.workUrl = this.workUrl.substring("host:".length()+ portStr.length()+"/".length());
        }

        this.host = getWord("/");
        this.path = getWord("\\?");

        this.query = this.workUrl;

    }

    public String getProtocol() {
        return protocol;
    }

    public int getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public String getHost() {
        return host;
    }

    public boolean hasProperty(String key) {
        return false;
    }

    public String getProperty(String key) {
        return "";
    }

    private int posInUrl( String text, int startIndex ) {
        String[] words = this.workUrl.split(text);
        int pos =0;

        for ( int i=0; i < words.length; i++ ) {
            pos += words[i].length();
            break;
        }
        return pos;
    }

    private String getWordBetween(String s1, String s2, int startIndex) {
        int pos1 = posInUrl(s1,startIndex);
        if (pos1 == -1 ) return "";

        int pos2 = posInUrl(s2,startIndex + s1.length());
        if (pos2 == -1 )  return "";

        return this.workUrl.substring(pos1+ s1.length(), pos2);
    }

    private String getWord( String nextKey ) {
        int pos = posInUrl(nextKey,0);
        String retStr = this.workUrl.substring(0,pos );

        pos += nextKey.length();
        this.workUrl = this.workUrl.substring(pos);

        return retStr;

    }
}
