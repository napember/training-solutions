package stringmethods;

public class UrlMain {
    public static void main(String[] args) {
        UrlManager um = new UrlManager("https://host:123/earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");

        System.out.println(um.getProtocol());
        System.out.println(um.getPort());
        System.out.println(um.getHost());
        System.out.println(um.getPath());
        System.out.println(um.getQuery());

    }
}
