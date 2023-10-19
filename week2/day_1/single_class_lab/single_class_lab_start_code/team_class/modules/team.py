class Team:


    def __init__ (self, input_name, input_players, input_coach):
        self.name = input_name
        self.players = input_players
        self.coach = input_coach
        self.points = 0
        

    def add_player(self, player):
        self.players.append(player)

    def has_player (self, name):
        # result = False
        # for player in self.players:
        #     if player == name:
        #         result = True
        # return result

        if name in self.players:
            return True
        return False
    
    
    def play_game(self ,win):
        if win ==True:
            self.points += 3
        