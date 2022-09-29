

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	//distancia entre esta localização e a outra informada
	public double distancia(Geo outra) {
        Geo obj = new Geo(getLatitude(), getLongitude());
        return distancia(obj, outra);
    }

	//distancia entre dois objetos
	public static double distancia(Geo g1, Geo g2) {
		double lat1 = Math.toRadians(g1.getLatitude());
		double lat2 = Math.toRadians(g2.getLatitude());
		double long1 = Math.toRadians(g1.getLongitude());
		double long2 = Math.toRadians(g2.getLongitude());

		double diflat = (lat1 - lat2) / 2;
        double diflon = (long1 - long2) / 2;
        
        double distancia = Math.pow(Math.sin(diflat), 2) +
                   Math.pow(Math.sin(diflon), 2) *
                   Math.cos(lat1) * Math.cos(lat2);
        
        distancia = 2 * 6371 * Math.asin(Math.sqrt(distancia));
                
        return distancia; 
	}

	public String toString() {
		return "LA: " + latitude + " LO: " + longitude;
	}
}
