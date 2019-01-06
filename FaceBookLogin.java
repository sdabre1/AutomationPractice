import AutoFramework.BasicMethodForFB;

public class FaceBookLogin extends BasicMethodForFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicMethodForFB basicMethodForFB = new BasicMethodForFB();
		basicMethodForFB.url();
		basicMethodForFB.loginId("sdabre1");
		basicMethodForFB.Password("smdabrewhites12345");
		basicMethodForFB.clickLogIn();
		basicMethodForFB.close();

	}

}
