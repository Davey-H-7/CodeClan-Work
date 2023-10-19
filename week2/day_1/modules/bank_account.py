class BankAccount:

    def __init__(self, input_holder_name, input_balance, input_type, input_pin):
        self.holder_name = input_holder_name
        self.balance = input_balance
        self.type = input_type
        self._pin = input_pin
    
    def pay_in(self, amount):
        self.balance += amount

    def pay_monthly_fee(self):
        if self.type == 'business':
            self.balance -= 50
        elif self.type == 'personal':
            self.balance -= 10
        

    

    # def get_account_name(account):
    #     return account['holder_name']