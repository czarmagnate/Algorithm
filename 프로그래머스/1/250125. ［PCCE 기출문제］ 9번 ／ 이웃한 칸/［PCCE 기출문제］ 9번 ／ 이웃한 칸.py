def solution(board, h, w):    
    board_list = []
    if h > 0 : 
        board_list.append(board[h-1][w])
    if h < len(board)-1: 
        board_list.append(board[h+1][w])
    if w > 0 : 
        board_list.append(board[h][w-1])
    if w < len(board[0])-1: 
        board_list.append(board[h][w+1])
    
    return board_list.count(board[h][w])