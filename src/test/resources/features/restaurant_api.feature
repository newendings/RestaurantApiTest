Feature: Test Restaurant App GET APIs

  @apiTest
  Scenario Outline: Verify each restaurant exists in database
    When I call the restaurant API with customer <customerId> and restaurant <restaurantId>

    Examples:
      | customerId                            | restaurantId                          |
      | 483528f2-d0da-4bd9-99ea-1556115ceba1  | a1cbc2c9-e271-4755-b392-6c9800e83fce  |
      | 483528f2-d0da-4bd9-99ea-1556115ceba1  | f4b728d7-69f8-4f36-8b7e-cdb314105db9  |
      | f0ae953d-bf56-462d-88cd-db0eecc0aaaf  | 91cc6c7d-1597-40db-ba69-ec7dff70b33f  |

    @apiTest
    Scenario: Verify fake customer returns an error code
      When I call a fake customerId abcdef