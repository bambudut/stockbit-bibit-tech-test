import { generalResponse } from '../../support/responseSchema'

describe('Update User Detail', () => {
    it('Success Updated User Data', () => {
        cy.updateUser().should((response) => {
            expect(response.status).to.eq(200)
            expect(response.body.code).to.be.not.null
            expect(response.body).to.have.property("code", 200)
            cy.validateSchema(generalResponse, response.body)
        })
    })
});