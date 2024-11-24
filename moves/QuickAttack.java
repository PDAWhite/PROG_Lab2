package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class QuickAttack extends PhysicalMove{
	public QuickAttack(){
		super(Type.NORMAL, 40, 100, 1, 1);
	}
	@Override
	protected String describe(){
		//String[] pieces = this.getClass().toString().split("\\.");
		//return "использует" + pieces[pieces.length-1];
		return "использует Quick Attack.";
	}
	
}