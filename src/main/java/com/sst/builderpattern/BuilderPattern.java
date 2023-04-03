/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sst.builderpattern;

/**
 *
 * @author MOB
 */
public class BuilderPattern {

    public static void main(String[] args) {
   User user1 = new User.UserBuilder("Lokesh", "Gupta")
	.age(30)
	.phone("1234567")
	.address("Fake address 1234")
	.build();

	System.out.println(user1);

	User user2 = new User.UserBuilder("Jack", "Reacher")
	.age(40)
	.phone("5655")
	//no address
	.build();

	System.out.println(user2);

	User user3 = new User.UserBuilder("Super", "Man")
	//No age
	//No phone
	//no address
	.build();

	System.out.println(user3);
}
}
