import pdb 
from models.task import Task
from models.user import User
import repositories.task_repository as task_repository  
import repositories.user_repository as user_repository

user_repository.delete_all()
task_repository.delete_all()

user_1 = User("Cobra", "Commander")
user_repository.save(user_1)

user_2 = User('Simon', 'Cowell')
user_repository.save(user_2)

users = user_repository.select_all()

task_1 = Task("Destroy Mainstream Music", 50, user_2)
task_repository.save(task_1)

task_2 = Task("Get extensive botox", 10, user_2)
task_repository.save(task_2)

results = task_repository.tasks_for_user(user_2)
print (results)

# for task in result:
#     print(task.__dict__)

# task_1 = Task('Take over world', 'Ming the Merciless', 10)
# task_repository.save(task_1)

# result = task_repository.select_all()

# task_1.mark_complete()
# task_repository.update(task_1)

# # for task in result:
# #   print(task.__dict__)

# found_task = task_repository.select(1)
# found_task.description = 'New description'
# task_repository.update(found_task)

# # task_repository.delete_all()
# # task_repository.delete(1)
# result = task_repository.select_all()

# for task in result:
#     print(task.__dict__)


pdb.set_trace()