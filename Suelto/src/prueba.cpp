#include <iostream>

inline float volumen_cubo(float lado) {return lado*lado*lado;}

int main(){
    float lado;
    std::cout <<"Introdusca el lado del Cubo:"<<std::endl;  //printf("");
    std::cin>>lado; //scanf("%f",&lado);
    std::cout<<"El volumen del cubo de lado "<<lado<<" es de "<<volumen_cubo(lado)<<std::endl;  //printf("%f",lado);
    return 0;
}