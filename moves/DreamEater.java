package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Stat;

public class DreamEater extends SpecialMove{
	public DreamEater(){
		super(Type.PSYCHIC, 100, 100);
	}
	@Override
	protected void applyOppDamage(Pokemon def, double damage){
		//Разобраться как проверить, есть ли в кондишках сон, только при этом накинуть урон + закинуть урон себе в виде хила.
		if (def.getCondition() == Status.SLEEP)
		{
			super.applyOppDamage(def, damage);
		}
		else{
			damage = 0.0;
		}
	}
	@Override
	protected void applySelfDamage(Pokemon att, double damage){
		att.setMod(Stat.HP, (int) Math.round(-damage / 2)); 
	}
	@Override
	protected String describe(){
		//String[] pieces = this.getClass().toString().split("\\.");
		//return "использует" + pieces[pieces.length-1];
		return "использует Dream Eater.";
	}
	
}