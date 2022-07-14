import { storeResponse } from '../../../support/response/store/base.store'

describe('Get Order By ID', () => {
    it('Success Get Order ID', () => {
        cy.postStoreOrder().then((postStoreOrder) => {
            cy.getStoreOrderById(postStoreOrder.body.id).should((response) => {
                expect(response.status).to.eq(200)
                expect(response.body.id).to.be.not.null
                expect(response.body.petId).to.be.not.null
                expect(response.body.status).to.be.not.null
                expect(response.body).to.have.property("petId", 9223372000001106341)
                expect(response.body).to.have.property("status", "placed")    
                cy.schemaValidator(storeResponse, response.body)
            })
        })
    })
});