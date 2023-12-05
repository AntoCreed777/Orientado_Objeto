#include <iostream>

#define BOLD "\e[1m"
#define WHITE "\e[7m"
#define BLUE "\e[44m"
#define NORMAL "\e[0m"

class Cubo{
    private:
        float lado,area,volumen;
    public:
        Cubo();
        void view_data();
        ~Cubo();
};

Cubo::Cubo(){
    float x;

    //printf("");//scanf("%f",&lado);
    std::cout <<"Introdusca el lado del Cubo:   ";std::cin>>x;

    lado = x;
    area = x*x*6;
    volumen = x*x*x;
}

void Cubo::view_data(){     //printf("%f %f %f",lado,area,volumen);
    std::cout <<"El largo del lado es "<<BOLD<<lado<<NORMAL<<" cm, el area es "<<BOLD<<area<<NORMAL<<" cm^2, el volumen es "<<BOLD<<volumen<<NORMAL<<" cm^3."<<std::endl;
}

Cubo::~Cubo(){}

int main(){

    Cubo cubo;
    cubo.view_data();

    return 0;
}