#include <iostream>
using namespace std;
//Base Class
class Characters{};

//Extend
class Paraszt: public Characters{
    protected:
         string name;
    public:
         void set_name();
         void move();
};

class Bastya:public Characters{
    protected:
        string name;
    public:
        void set_name();
        void move;
};

class Lo:public Characters{
    protected:
        string name;
    public:
        void set_name();
        void move;
};

class Futo:public Characters{
    protected:
        string name;
    public:
        void set_name();
        void move;
};

class Kiraly:public Characters{
    protected:
        string name;
    public:
        void set_name();
        void move;
};

class Knö:public Characters{
    protected:
        string name;
    public:
        void set_name();
        void move;
};
