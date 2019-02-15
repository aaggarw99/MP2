package com.example.mp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.View;
import android.content.Intent;
import android.util.Log;

public class searchCategory extends AppCompatActivity implements View.OnClickListener {

    public CheckBox normal, fire, fighting, water, psychic, ground, rock, fairy, dragon, poison,
            electric, grass, bug, flying, ice, dark, ghost, steel;


    public Button cancel, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_category);

        cancel = findViewById(R.id.cancel);
        next = findViewById(R.id.next);

        normal = findViewById(R.id.normal);
        fire =  findViewById(R.id.fire);
        fighting = findViewById(R.id.fighting);
        water = findViewById(R.id.water);
        psychic =  findViewById(R.id.psychic);
        ground =  findViewById(R.id.ground);
        rock =  findViewById(R.id.rock);
        fairy =  findViewById(R.id.fairy);
        dragon =  findViewById(R.id.dragon);
        poison =  findViewById(R.id.poison);
        electric =  findViewById(R.id.electric);
        grass =  findViewById(R.id.grass);
        bug =  findViewById(R.id.bug);
        flying =  findViewById(R.id.flying);
        ice =  findViewById(R.id.ice);
        dark =  findViewById(R.id.dark);
        ghost =  findViewById(R.id.ghost);
        steel =  findViewById(R.id.steel);

        normal.setOnClickListener(this);
        fire.setOnClickListener(this);
        fighting.setOnClickListener(this);
        water.setOnClickListener(this);
        psychic.setOnClickListener(this);
        ground.setOnClickListener(this);
        rock.setOnClickListener(this);
        fairy.setOnClickListener(this);
        dragon.setOnClickListener(this);
        poison.setOnClickListener(this);
        electric.setOnClickListener(this);
        grass.setOnClickListener(this);
        bug.setOnClickListener(this);
        flying.setOnClickListener(this);
        ice.setOnClickListener(this);
        dark.setOnClickListener(this);
        ghost.setOnClickListener(this);
        steel.setOnClickListener(this);

        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                // Start NewActivity.class
                Intent myIntent = new Intent(searchCategory.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Log.i("Wait", "Not implemented yet");
            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.normal:
                normal.setChecked(!normal.isChecked());
                break;
            case R.id.fire:
                fire.setChecked(!fire.isChecked());
                break;
            case R.id.fighting:
                fighting.setChecked(!fighting.isChecked());
                break;
            case R.id.flying:
                flying.setChecked(!flying.isChecked());
                break;
            case R.id.ground:
                ground.setChecked(!ground.isChecked());
                break;
            case R.id.psychic:
                psychic.setChecked(!psychic.isChecked());
                break;
            case R.id.poison:
                poison.setChecked(!poison.isChecked());
                break;
            case R.id.dark:
                dark.setChecked(!dark.isChecked());
                break;
            case R.id.rock:
                rock.setChecked(!rock.isChecked());
                break;
            case R.id.water:
                water.setChecked(!water.isChecked());
                break;
            case R.id.ghost:
                ghost.setChecked(!ghost.isChecked());
                break;
            case R.id.grass:
                grass.setChecked(!grass.isChecked());
                break;
            case R.id.bug:
                bug.setChecked(!bug.isChecked());
                break;
            case R.id.electric:
                electric.setChecked(!electric.isChecked());
                break;
            case R.id.fairy:
                fairy.setChecked(!fairy.isChecked());
                break;
            case R.id.dragon:
                dragon.setChecked(!dragon.isChecked());
                break;
            case R.id.ice:
                ice.setChecked(!ice.isChecked());
                break;
            case R.id.steel:
                steel.setChecked(!steel.isChecked());
                break;

        }
    }

}
