
public class TeacherCreditManager  extends BaseCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		System.out.println("Öğretmen Kredisi hesaplandı ");
		
	}

	@Override
	public void Save() {
		System.out.println("Kaydedildi");
		
	}

}
