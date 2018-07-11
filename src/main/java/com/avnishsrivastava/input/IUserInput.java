package com.avnishsrivastava.input;

import java.util.List;

/*
 *  Created by: Avnish Srivastava
 *  github    : www.github.com/avnish8
 *  email     : avnishsrivastava@virtusa.com
 *
 *  This is the interface used by the decoder to
 *  enable dependency inversion / Strategy Design Pattern
 *
 *  This enables change of input method without modifying the
 *  decoder class itself
 *
 * */

public interface IUserInput {

    List<Integer> getNumbersListFromInput();
}
