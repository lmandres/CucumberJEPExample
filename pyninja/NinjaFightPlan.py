class NinjaFightPlan():

    WHITE = 1
    GRAY = 2
    YELLOW = 3
    ORANGE = 4
    GREEN = 5
    BLUE = 6
    PURPLE = 7
    BLACK = 8
    BLACK_1ST = 9
    BLACK_2ND = 10
    BLACK_3RD = 11
    BLACK_4TH = 12
    BLACK_5TH = 13
    BLACK_6TH = 14
    BLACK_7TH = 15
    BLACK_8TH = 16
    BLACK_9TH = 17
    BLACK_10TH = 18
    CHUCK_NORRIS = 10000000

    ninjaBelt = None
    opponentBelt = None

    def __init__(self, beltIn=None):
        self.ninjaBelt = beltIn

    def setNinjaBelt(self, beltIn):
        self.ninjaBelt = beltIn

    def getNinjaBelt(self):
        return self.ninjaBelt

    def setOpponentBelt(self, beltIn):
        self.opponentBelt = beltIn

    def getOpponentBelt(self):
        return self.opponentBelt

    def fightOpponent(self, opponentBelt=None):

        returnFightDecision = False

        if opponentBelt:
            self.opponentBelt = opponentBelt

        if self.opponentBelt < self.ninjaBelt:
            returnFightDecision = True

        return returnFightDecision

