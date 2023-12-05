#include <iostream>

#define BOLD "\e[1m"
#define WHITE "\e[7m"
#define BLUE "\e[44m"
#define NORMAL "\e[0m"

class Peon{
    private:
        int fila,columna,life,team;
    public:
        Peon();
        Peon(int x,int y,int z);
        int Columna();
        int Fila();
        int Team();
        ~Peon();
};
Peon::Peon() : fila(0),columna(0),life(1) {};
Peon:: Peon(int x,int y,int z) : fila(x),columna(y),life(1),team(z) {};
int Peon:: Columna(){return columna;}
int Peon:: Fila(){return fila;}
int Peon:: Team(){return team;}
Peon:: ~Peon(){}

class Torre{
    private:
        int fila,columna,life,team;
    public:
        Torre();
        Torre(int x,int y,int z);
        int Columna();
        int Fila();
        int Team();
        ~Torre();
};
Torre::Torre() : fila(0),columna(0),life(1) {};
Torre:: Torre(int x,int y,int z) : fila(x),columna(y),life(1),team(z) {};
int Torre:: Columna(){return columna;}
int Torre:: Fila(){return fila;}
int Torre:: Team(){return team;}
Torre:: ~Torre(){}

class Caballo{
    private:
        int fila,columna,life,team;
    public:
        Caballo();
        Caballo(int x,int y,int z);
        int Columna();
        int Fila();
        int Team();
        ~Caballo();
};
Caballo::Caballo() : fila(0),columna(0),life(1) {};
Caballo:: Caballo(int x,int y,int z) : fila(x),columna(y),life(1),team(z) {};
int Caballo:: Columna(){return columna;}
int Caballo:: Fila(){return fila;}
int Caballo:: Team(){return team;}
Caballo:: ~Caballo(){}

class Alfil{
    private:
        int fila,columna,life,team;
    public:
        Alfil();
        Alfil(int x,int y,int z);
        int Columna();
        int Fila();
        int Team();
        ~Alfil();
};
Alfil::Alfil() : fila(0),columna(0),life(1) {};
Alfil:: Alfil(int x,int y,int z) : fila(x),columna(y),life(1),team(z) {};
int Alfil:: Columna(){return columna;}
int Alfil:: Fila(){return fila;}
int Alfil:: Team(){return team;}
Alfil:: ~Alfil(){}

class Dama{
    private:
        int fila,columna,life,team;
    public:
        Dama();
        Dama(int x,int y,int z);
        int Columna();
        int Fila();
        int Team();
        ~Dama();
};
Dama::Dama() : fila(0),columna(0),life(1) {};
Dama:: Dama(int x,int y,int z) : fila(x),columna(y),life(1),team(z) {};
int Dama:: Columna(){return columna;}
int Dama:: Fila(){return fila;}
int Dama:: Team(){return team;}
Dama:: ~Dama(){}

class Rey{
    private:
        int fila,columna,life,team;
    public:
        Rey();
        Rey(int x,int y,int z);
        int Columna();
        int Fila();
        int Team();
        ~Rey();
};
Rey::Rey() : fila(0),columna(0),life(1) {};
Rey:: Rey(int x,int y,int z) : fila(x),columna(y),life(1),team(z) {};
int Rey:: Columna(){return columna;}
int Rey:: Fila(){return fila;}
int Rey:: Team(){return team;}
Rey:: ~Rey(){}

class Tablero{
    private:
        int piezas = 32;
        //Fila, Columna
        Peon peones[16] = {Peon(1,0,0),Peon(1,1,0),Peon(1,2,0),Peon(1,3,0),Peon(1,4,0),Peon(1,5,0),
                            Peon(1,6,0),Peon(1,7,0),Peon(6,0,1),Peon(6,1,1),Peon(6,2,1),Peon(6,3,1),
                            Peon(6,4,1),Peon(6,5,1),Peon(6,6,1),Peon(6,7,1)};
        Torre torres[4] = {Torre(0,0,0),Torre(0,7,0),Torre(7,0,1),Torre(7,7,1)};
        Caballo caballos[4] = {Caballo(0,1,0),Caballo(0,6,0),Caballo(7,1,1),Caballo(7,6,1)};
        Alfil alfiles[4] = {Alfil(0,2,0),Alfil(0,5,0),Alfil(7,2,1),Alfil(7,5,1)};
        Dama damas[2] = {Dama(0,3,0),Dama(7,3,1)};
        Rey reyes[2] = {Rey(0,4,0),Rey(7,4,1)};
    public:
        Tablero();
        void ver();
        ~Tablero();
};

Tablero::Tablero(){}
void Tablero::ver(){
    //Creacion de array querepresenta las posiciones de las piezas en el tablero
    char tablero[8][8];
    int teams[8][8];
    for(int i=0; i<8;i++){
        for(int j=0;j<8;j++){
            tablero[i][j] = '_';
            teams[i][j] = -1;
        }
    }

    //Peones
    for(int i=0;i<16;i++){
        tablero[peones[i].Fila()][peones[i].Columna()] = 'P';
        teams[peones[i].Fila()][peones[i].Columna()] = peones[i].Team();
    }

    //Torres
    for(int i=0;i<4;i++){
        tablero[torres[i].Fila()][torres[i].Columna()] = 'T';
        teams[torres[i].Fila()][torres[i].Columna()] = torres[i].Team();
    }

    //Caballos
    for(int i=0;i<4;i++){
        tablero[caballos[i].Fila()][caballos[i].Columna()] = 'C';
        teams[caballos[i].Fila()][caballos[i].Columna()] = caballos[i].Team();
    }

    //Alfiles
    for(int i=0;i<4;i++){
        tablero[alfiles[i].Fila()][alfiles[i].Columna()] = 'A';
        teams[alfiles[i].Fila()][alfiles[i].Columna()] = caballos[i].Team();
    }

    //Damas
    for(int i=0;i<2;i++){
        tablero[damas[i].Fila()][damas[i].Columna()] = 'Q';
        teams[damas[i].Fila()][damas[i].Columna()] = damas[i].Team();
    }

    //Reyes
    for(int i=0;i<2;i++){
        tablero[reyes[i].Fila()][reyes[i].Columna()] = 'R';
        teams[reyes[i].Fila()][reyes[i].Columna()] = reyes[i].Team();
    }

    //Impresion del tablero
    for(int i=0; i<8;i++){
        for(int j=0;j<8;j++){
            if(teams[i][j] == 0){
                std::cout<<WHITE<<BOLD<<tablero[i][j]<<NORMAL<<" ";
            }
            else if(teams[i][j] == 1){
                std::cout<<BLUE<<BOLD<<tablero[i][j]<<NORMAL<<" ";
            }
            else{
                std::cout<<"  ";
            }
        }
        std::cout<<std::endl;
    }
}
Tablero::~Tablero(){}

int main(){
    Tablero tablero;
    tablero.ver();
    return 0;
}