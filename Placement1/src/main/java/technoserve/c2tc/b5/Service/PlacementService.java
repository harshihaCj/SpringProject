package technoserve.c2tc.b5.Service;

import technoserve.c2tc.b5.entities.Placement;

public interface PlacementService {

	public void addPlacement(Placement p);
	public Placement updatePlacement(Placement p);
	//public void SearchPlacement(int id);
	
	public void cancelPlacement(int id);
	public Placement getPlacement(int id);
	
	
}
