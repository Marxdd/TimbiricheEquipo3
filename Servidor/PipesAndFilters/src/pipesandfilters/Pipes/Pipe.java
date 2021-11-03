/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesandfilters.Pipes;

/**
 *
 * @author Equipo 3
 * @param <I> Entrada
 * @param <O> FiltroSalida
 */
interface Pipe<I, O> {
    void pasar(I objeto);
}