package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Superpower extends PhysicalMove{
	public Superpower(){
		super(Type.FIGHTING, 120, 100);
	}
	@Override
	protected void applySelfEffects(Pokemon p){
		super.applySelfEffects(p);
		p.setMod(Stat.ATTACK, -1);
		p.setMod(Stat.DEFENSE, -1);
	}
	@Override
	protected String describe(){
		//String[] pieces = this.getClass().toString().split("\\.");
		//return "использует" + pieces[pieces.length-1];
		return "использует Superpower.";
	}
}
