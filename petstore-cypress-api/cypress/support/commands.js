// ***********************************************
// This example commands.js shows you how to
// create various custom commands and overwrite
// existing commands.
//
// For more comprehensive examples of custom
// commands please read more here:
// https://on.cypress.io/custom-commands
// ***********************************************

import { validateSchema } from "../support/validateSchema";

// Validate schema
Cypress.Commands.add("validateSchema", validateSchema);

// Post store order
Cypress.Commands.add("postStoreOrder", () => {
    cy.request({
        method: "POST",
        failOnStatusCode: false,
        url: `/store/order`,
        headers: {
            accept: "application/json"
        },
        body: {
            "id": 0,
            "petId": 9223372000001106341,
            "quantity": 2,
            "shipDate": "2022-04-20T10:30:00.750Z",
            "status": "placed",
            "complete": true
        }
    })
})

// Get order by ID
Cypress.Commands.add("getOrderById", (id) => {
    cy.request({
        method: "GET",
        failOnStatusCode: false,
        url: `/store/order/${id}`,
        headers: {
            accept: "application/json"
        }
    })
})

// Delete order by ID
Cypress.Commands.add("deleteOrderById", (id) => {
    cy.request({
        method: "DELETE",
        failOnStatusCode: false,
        url: `/store/order/${id}`,
        headers: {
            accept: "application/json"
        }
    })
})

// Update user by username
Cypress.Commands.add("updateUser", () => {
    cy.request({
        method: "PUT",
        failOnStatusCode: false,
        url: `/user/klontongapp`,
        headers: {
            accept: "application/json"
        },
        body: {
            "id": 0,
            "username": "klontongapp",
            "firstName": "Bambang",
            "lastName": "Danuwari",
            "email": "bambang.oke@gmail.com",
            "password": "pwdBambang",
            "phone": "081100228899",
            "userStatus": 0
        }
    })
})