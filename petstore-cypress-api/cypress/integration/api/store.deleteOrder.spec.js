import { generalResponse } from '../../support/responseSchema'

describe('Delete Order By ID', () => {
    it('Success Deleted Order', () => {
        cy.postStoreOrder().then((postStoreOrder) => {
            cy.deleteOrderById(postStoreOrder.body.id).should((response) => {
                expect(response.status).to.eq(200)
                expect(response.body.code).to.be.not.null
                expect(response.body).to.have.property("code", 200)
                cy.validateSchema(generalResponse, response.body)
            })
        })
    })
});