package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent i1;
    Button reset;
    Button b[]=new Button[9];
    TextView tv;
    int flag=0,winner=0;
    void win()
    {
        if((b[0].getText().equals("0") && b[1].getText().equals("0") && b[2].getText().equals("0")) ||
                (b[0].getText().equals("0") && b[3].getText().equals("0") && b[6].getText().equals("0")) ||
                (b[6].getText().equals("0") && b[7].getText().equals("0") && b[8].getText().equals("0")) ||
                (b[8].getText().equals("0") && b[5].getText().equals("0") && b[2].getText().equals("0")) ||
                (b[0].getText().equals("0") && b[4].getText().equals("0") && b[8].getText().equals("0")) ||
                (b[2].getText().equals("0") && b[4].getText().equals("0") && b[6].getText().equals("0")) ||
                (b[4].getText().equals("0") && b[1].getText().equals("0") && b[7].getText().equals("0")) ||
                (b[5].getText().equals("0") && b[4].getText().equals("0") && b[3].getText().equals("0"))
        )
        {
            tv.setText("0 is the winner..");
            winner = 2;
            i1=new Intent(MainActivity.this,notification.class);
            i1.putExtra("win","0");
            startActivity(i1);
        }
        if((b[0].getText().equals("X") && b[1].getText().equals("X") && b[2].getText().equals("X")) ||
                (b[0].getText().equals("X") && b[3].getText().equals("X") && b[6].getText().equals("X")) ||
                (b[6].getText().equals("X") && b[7].getText().equals("X") && b[8].getText().equals("X")) ||
                (b[8].getText().equals("X") && b[5].getText().equals("X") && b[2].getText().equals("X")) ||
                (b[0].getText().equals("X") && b[4].getText().equals("X") && b[8].getText().equals("X")) ||
                (b[2].getText().equals("X") && b[4].getText().equals("X") && b[6].getText().equals("X")) ||
                (b[4].getText().equals("X") && b[1].getText().equals("X") && b[7].getText().equals("X")) ||
                (b[5].getText().equals("X") && b[4].getText().equals("X") && b[3].getText().equals("X"))
        )
        {
            tv.setText("X is the winner..");
            winner=1;
            i1=new Intent(MainActivity.this,notification.class);
            i1.putExtra("win","X");
            startActivity(i1);
        }
        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reset=(Button)findViewById(R.id.reset);
        tv=(TextView)findViewById(R.id.heading);
        b[0]=(Button)findViewById(R.id.b1);
        b[1]=(Button)findViewById(R.id.b2);
        b[2]=(Button)findViewById(R.id.b3);
        b[3]=(Button)findViewById(R.id.b4);
        b[4]=(Button)findViewById(R.id.b5);
        b[5]=(Button)findViewById(R.id.b6);
        b[6]=(Button)findViewById(R.id.b7);
        b[7]=(Button)findViewById(R.id.b8);
        b[8]=(Button)findViewById(R.id.b9);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int J=0;J<9;J++)
                    b[J].setText("");
                tv.setText("Let's Play....");
                winner=0;
                flag=0;
            }
        });
        b[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b[0].getText().length()==0)
                {
                    if(flag==0)
                    {
                        flag=1;
                        b[0].setText("X");
                    }
                    else
                    {
                        flag=0;
                        b[0].setText("0");
                    }
                    if(winner==0)
                    {
                        win();
                    }
                }
            }
        });
        b[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b[1].getText().length()==0)
                {
                    if(flag==0)
                    {
                        flag=1;
                        b[1].setText("X");
                    }
                    else
                    {
                        flag=0;
                        b[1].setText("0");
                    }
                    if(winner==0)
                    {
                        win();
                    }
                }
            }
        });
        b[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b[2].getText().length()==0)
                {
                    if(flag==0)
                    {
                        flag=1;
                        b[2].setText("X");
                    }
                    else
                    {
                        flag=0;
                        b[2].setText("0");
                    }
                    if(winner==0)
                    {
                        win();
                    }
                }
            }
        });
        b[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b[3].getText().length()==0)
                {
                    if(flag==0)
                    {
                        flag=1;
                        b[3].setText("X");
                    }
                    else
                    {
                        flag=0;
                        b[3].setText("0");
                    }
                    if(winner==0)
                    {
                        win();
                    }
                }
            }
        });
        b[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b[4].getText().length()==0)
                {
                    if(flag==0)
                    {
                        flag=1;
                        b[4].setText("X");
                    }
                    else
                    {
                        flag=0;
                        b[4].setText("0");
                    }
                    if(winner==0)
                    {
                        win();
                    }
                }
            }
        });
        b[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b[5].getText().length()==0)
                {
                    if(flag==0)
                    {
                        flag=1;
                        b[5].setText("X");
                    }
                    else
                    {
                        flag=0;
                        b[5].setText("0");
                    }
                    if(winner==0)
                    {
                        win();
                    }
                }
            }
        });
        b[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b[6].getText().length()==0)
                {
                    if(flag==0)
                    {
                        flag=1;
                        b[6].setText("X");
                    }
                    else
                    {
                        flag=0;
                        b[6].setText("0");
                    }
                    if(winner==0)
                    {
                        win();
                    }
                }
            }
        });
        b[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b[7].getText().length()==0)
                {
                    if(flag==0)
                    {
                        flag=1;
                        b[7].setText("X");
                    }
                    else
                    {
                        flag=0;
                        b[7].setText("0");
                    }
                    if(winner==0)
                    {
                        win();
                    }
                }
            }
        });
        b[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b[8].getText().length()==0)
                {
                    if(flag==0)
                    {
                        flag=1;
                        b[8].setText("X");
                    }
                    else
                    {
                        flag=0;
                        b[8].setText("0");
                    }
                    if(winner==0)
                    {
                        win();
                    }
                }
            }
        });
    }
}
