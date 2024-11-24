package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class TailWhip extends StatusMove{
	public TailWhip(){
		super(Type.NORMAL, 0, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		super.applyOppEffects(p);
		p.setMod(Stat.DEFENSE, -1);
	}
	@Override
	protected String describe(){
		return "использует Tail Whip.";
	}
}