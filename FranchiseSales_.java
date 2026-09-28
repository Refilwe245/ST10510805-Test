/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.franchisesales;

/**
 *
 * @author Student
 */
public class FranchiseSales_{
        public static void main(String[] args) {
            
            // 1D Array for Franchise Locations 
String[] cities = {"Cape Town", "Port Elizedbeth", "Pretoria"}; 
// 1D Array for Franchise Locations 
String[] consoles = {"PS5", "XBOX", "SWITCH"};

  

// 2D Array for Console Sales: [Row = City][Column = Console] 

// Columns: Index 0 = PS5, Index 1 = Xbox, Index 2 = Switch 

int[][] salesMatrix = { 

    {1000, 20000, 3000},  // Cape Town 

    {2000, 3000, 4000},   // Port Elizebeth 

    {1500, 1100, 1200}  // Pretoria 

}; 

  

// Calculate and display total sales per city 

for (int i = 0; i < cities.length; i++) { 

    int cityTotal = 0; 

    for (int j = 0; j < salesMatrix[i].length; j++) { 

        cityTotal += salesMatrix[i][j]; 

    } 

    System.out.println("Total yearly sales for " + cities[i] + ": " + cityTotal); 
    // Loop to print each city, individual console numbers, and city total 

 

    System.out.println("--- " + cities[i] + " Report ---"); 

 

     

    for (int j = 0; j < salesMatrix[i].length; j++) { 

        // Displays individual console name and its specific sales count for this city 

        System.out.println(consoles[j] + " Sales: " + salesMatrix[i][j]); 

        cityTotal += salesMatrix[i][j]; 

    } 

    // Displays the aggregated total for the specific city 

    System.out.println("-> Total Sales for " + cities[i] + ": " + cityTotal + "\n"); 

} 
    

} 
        
    }

