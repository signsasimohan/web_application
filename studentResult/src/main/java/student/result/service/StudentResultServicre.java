package student.result.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.result.dao.StudentResultDao;
import student.result.entity.Results;

@Service

public class StudentResultServicre {
	@Autowired	StudentResultDao stuDao;
	
	public String insertData(Results sr) {
		
		double total = (double) sr.getTotalMarks();
		double ans = ((total/400)*100);
		int fans = (int) ans;
		sr.setTotalMarks(fans);
		sr.setPercentage(fans);
		
		return stuDao.insertDao(sr);
		
	}
	/*public List<Results>gettoprankers(){
		
		return stuDao.gettoprankers();
	}*/

}
