package technoserve.c2tc.b5.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import technoserve.c2tc.b5.Repo.PlacementRepo;
import technoserve.c2tc.b5.entities.Placement;
@Service
public class PlacementServiceImpl implements PlacementService {
	@Autowired
	PlacementRepo pr;

	@Override
	public void addPlacement(Placement p) {
		pr.save(p);
	}

	@Override
	public Placement updatePlacement(Placement p) {
	  pr.save(p);
		return p;
	}


	@Override
	public void cancelPlacement(int id) {
		Placement p=pr.findById(id).get();
		pr.delete(p);
		

	}

//	@Override
//	public void SearchPlacement(long id) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public Placement getPlacement(int id) {
		return pr.findById(id).get();
	}



}
