Feature: Ticket Booking
Scenario: Hold tickets until transaction is completed or canceled
Given User is on ticket booking page
When User selects ticket
And Proceeds for payment
Then Keep the ticket blocked until user completes or cancels the transaction
