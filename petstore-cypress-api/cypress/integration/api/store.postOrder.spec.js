import { storeResponse } from '../../support/responseSchema'

describe('Post Store Order', () => {
    it('Success Create Order', () => {
        cy.postStoreOrder().should((response) => {
            expect(response.status).to.eq(200)
            expect(response.body.id).to.be.not.null
            expect(response.body.petId).to.be.not.null
            expect(response.body.status).to.be.not.null
            expect(response.body).to.have.property("petId", 9223372000001106341)
            expect(response.body).to.have.property("status", "placed")
            cy.validateSchema(storeResponse, response.body)
        })
    })
});