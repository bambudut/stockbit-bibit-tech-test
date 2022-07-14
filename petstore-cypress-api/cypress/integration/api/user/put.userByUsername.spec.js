import { commonResponse } from '../../../support/response/common/common'

describe('Update User Detail', () => {
    it('Success Updated User Data', () => {
        cy.putUserByUsername("klontongapp").should((response) => {
            expect(response.status).to.eq(200)
            expect(response.body.code).to.be.not.null
            expect(response.body).to.have.property("code", 200)
            cy.schemaValidator(commonResponse, response.body)
        })
    })
});