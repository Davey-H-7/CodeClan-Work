from modules.bank_account import *


bank_account_1 = BankAccount('John', 500, 'business')
bank_account_2 = BankAccount('Steve', -500, 'personal')

bank_account_1.pay_in(100)
print(bank_account_1.balance)
print(bank_account_2.balance)

bank_account_1.pay_monthly_fee()
print(bank_account_1.balance)

bank_account_2.pay_monthly_fee()
print(bank_account_2.balance)