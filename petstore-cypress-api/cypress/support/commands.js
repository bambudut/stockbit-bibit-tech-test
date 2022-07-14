import { validator } from "../support/validator";

Cypress.Commands.add("schemaValidator", validator);

Cypress.Commands.add("deleteStoreOrderById", (id) => {
    cy.request({
        method: "DELETE",
        failOnStatusCode: false,
        url: `/store/order/${id}`,
        headers: {
            accept: "application/json"
        }
    })
})

Cypress.Commands.add("getStoreOrderById", (id) => {
    cy.request({
        method: "GET",
        failOnStatusCode: false,
        url: `/store/order/${id}`,
        headers: {
            accept: "application/json"
        }
    })
})

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

Cypress.Commands.add("putUserByUsername", (username) => {
    cy.request({
        method: "PUT",
        failOnStatusCode: false,
        url: `/user/${username}`,
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