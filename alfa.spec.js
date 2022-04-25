describe('alfa test app', () => {
    beforeEach(() => {
        cy.visit('http://qainterview.pythonanywhere.com/')
    })

    it('check factorial 0', () => {
        cy.get('input')
            .type('0').should('have.value', '0')
        cy.get('#getFactorial').click()
        cy.get('#resultDiv')
            .should('have.text', 'The factorial of 0 is: 1')
    });

    it('check factorial 1', () => {
        cy.get('input')
            .type('1').should('have.value', '1')
        cy.get('#getFactorial').click()
        cy.get('#resultDiv')
            .should('have.text', 'The factorial of 1 is: 1')
    });

    it('check factorial 169', () => {
        cy.get('input')
            .type('169').should('have.value', '169')
        cy.get('#getFactorial').click()
        cy.get('#resultDiv')
            .should('have.text', 'The factorial of 169 is: 4.269068009004705e+304')
    });

    it('check factorial 170', () => {
        cy.get('input')
            .type('170').should('have.value', '170')
        cy.get('#getFactorial').click()
        cy.get('#resultDiv')
            .should('have.text', 'The factorial of 170 is: 7.257415615307999e+306')
    });

    it('check factorial 171', () => {
        cy.get('input')
            .type('171').should('have.value', '171')
        cy.get('#getFactorial').click()
        cy.get('#resultDiv')
            .should('have.text', 'The factorial of 171 is: Infinity')
    });

    it('check factorial ABC', () => {
        cy.get('input')
            .type('ABC').should('have.value', 'ABC')
        cy.get('#getFactorial').click()
        cy.get('#resultDiv')
            .should('have.text', 'Please enter an integer')
    });

    it('check factorial " "', () => {
        cy.get('input')
            .type(' ').should('have.value', ' ')
        cy.get('#getFactorial').click()
        cy.get('#resultDiv')
            .should('have.text', 'Please enter an integer')
    });

    it('check link - Terms and Conditions', () => {
        cy.get('[href="/privacy"]')
            .click()
    });

    it('check link - Privacy', () => {
        cy.get('[href="/terms"]')
            .click()
    });

    it('check link - Qxf2 Services', () => {
        cy.get('[href="https://www.qxf2.com/?utm_source=qa-interview&utm_medium=click&utm_campaign=From%20QA%20Interview"]')
            .click()
    });






























})