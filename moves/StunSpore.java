package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Effect;

public class StunSpore extends StatusMove{
	public StunSpore(){
		super(Type.GRASS, 0, 75);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		super.applyOppEffects(p);
		Effect paralyzer = new Effect();
		paralyzer.paralyze(p);
	}
	@Override
	protected String describe(){
		return "использует Stun Spore.";
	}
}