#include "tabla.h"
#include <vector>

void start_game(vector< vector<Characters*> >& table){
    int i = 0;
    int j = 0;
    
    vector<Characters*> sor;

    Paraszt p1;
    Paraszt p2;
    Paraszt p3;
    Paraszt p4;
    Paraszt p5;
    Paraszt p6;
    Paraszt p7;
    Paraszt p8;

    Bastya b1;
    Bastya b2;

    Lo l1;
    Lo l2;

    Futo f1;
    Futo f2;

    Kiraly kir;

    Knö kirnö;

    sor.push_back(b1);
    sor.push_back(l1);
    sor.push_back(f1);
    sor.push_back(kir);
    sor.push_back(kirnö);
    sor.push_back(f2);
    sor.push_back(l2);
    sor.push_back(b2);
    
    table.push_back(sor);
    sor.clear();

    sor.push_back(p1);                
    sor.push_back(p2);
    sor.push_back(p3);
    sor.push_back(p4);
    sor.push_back(p5);
    sor.push_back(p6);
    sor.push_back(p7);
    sor.push_back(p8);
    table.push_back(sor);
    sor.clear();
    

}
